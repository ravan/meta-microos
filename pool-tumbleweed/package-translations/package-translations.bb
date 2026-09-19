SUMMARY = "Summary and Descriptions Translations"
DESCRIPTION = "This package provides translations for our packages. You don't want to install this \
package on your system, it's only useful when you create openSUSE media."
LICENSE = "BSD-3-Clause"

PV = "89.87.20240323.9bdb784"

RPM_NAME = "package-translations-89.87.20240323.9bdb784-1.7.noarch.rpm"
RPM_HASH = "b6f3e9d460bbb502a07d1fe5015ba35dff37383a09d16780454eb04789c14cb242ecdb2a73149c9e0f11d3afe11886e59d2a03831e7ca28db86f0d8a9ec3d3d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "package-translations"

RDEPENDS:${PN} += ""

inherit rpm
