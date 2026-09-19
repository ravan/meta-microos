SUMMARY = "Docker build wrapper"
DESCRIPTION = "Dapper is a tool to wrap any existing build tool in an consistent environment. This allows people to build your software from source or modify it without worrying about setting up a build environment. The approach is very simple and taken from a common pattern that has adopted by many open source projects. Create a file called Dockerfile.dapper in the root of your repository. Dapper will build that Dockerfile and then execute a container based off of the resulting image. Dapper will also copy in source files and copy out resulting artifacts or will use bind mounting if you choose."
LICENSE = "Apache-2.0"

PV = "0.6.0"

RPM_NAME = "dapper-0.6.0-1.23.aarch64.rpm"
RPM_HASH = "9c610250f24a24814c18ee7d3ae1a9b43f61e968f32de162e9e994cc3e2e3d877377a5e6fb238af0999254924cf3595ca340160ad4fd1419f88cca3f6b225aec"

RPROVIDES:${PN} += "dapper"

RDEPENDS:${PN} += ""

inherit rpm
