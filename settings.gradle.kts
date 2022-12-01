pluginManagement {
    includeBuild("build-logic")
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
    plugins {

    }
}

enableFeaturePreview("VERSION_CATALOGS")

dependencyResolutionManagement {
    //这里需要注意的是，gradle 有一个默认配置名称为 libs，
    // 如果你创建的版本目录名称是 libs，那么你就无需通过 from 方法加载 libs.versions.toml 文件，
    // 因为 gradle 会默认此配置，你只需在 ./gradle 路径下创建 libs.versions.toml 文件即可，
    // 重复添加会导致编译失败；如果你已经有了一个 libs.versions.toml
    // 你也可以在添加以下配置来修改默认配置名称：
//    defaultLibrariesExtensionName.set("deps")
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}



rootProject.name = "ScaffoldX"


include(":app")
//core


//weiget


//feature
include(":feature:feedrss")
include(":feature:login")
include(":feature:profile")
