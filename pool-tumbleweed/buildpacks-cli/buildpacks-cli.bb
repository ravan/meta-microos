SUMMARY = "CLI for building apps using Cloud Native Buildpacks"
DESCRIPTION = "pack makes it easy for... \
 \
* App Developers to use buildpacks to convert code into runnable images. \
* Buildpack Authors to develop and package buildpacks for distribution. \
* Operators to package buildpacks for distribution and maintain applications."
LICENSE = "Apache-2.0"

PV = "0.40.9"

RPM_NAME = "buildpacks-cli-0.40.9-1.1.aarch64.rpm"
RPM_HASH = "53d2e2501ef659ea8e4b1782e02aadc2c390a1a817d8ef30ecd33ca025f8fe2c77030a05c9e3f953951eb1e90038a3c2f410a0cded794df9dadc476f008c7dbb"

RPROVIDES:${PN} += "buildpacks-cli \
pack"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
