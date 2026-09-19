SUMMARY = "Mono Addins Framework, MSBuild Support"
DESCRIPTION = "Mono.Addins is a generic framework for creating extensible \
applications, and for creating libraries which extend those \
applications. \
 \
This package contains the pkgconfig files."
LICENSE = "MIT"

PV = "1.3.3"

RPM_NAME = "mono-addins-devel-1.3.3-3.16.noarch.rpm"
RPM_HASH = "c428655538f08ced9c059934208eabc7c980cb618363543abe06ccd28ac8350e05cd235e9dc80356036623eeb10cfed67f178b44984b4c0c61605dee6b8d95f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mono-addins-devel \
pkgconfig-mono-addins \
pkgconfig-mono-addins-gui \
pkgconfig-mono-addins-msbuild \
pkgconfig-mono-addins-setup"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
mono-addins \
pkgconfig-mono-addins"

inherit rpm
