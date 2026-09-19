SUMMARY = "Simplified Chinese Linux man pages"
DESCRIPTION = "Modern Linux man pages localization project for Chinese language. \
 \
It's based on manpages-zh project, a successor for CMPP linux man \
pages translation project (discontinued), and Linux CN linux man \
pages translation project, with some new addons from openSUSE \
maintainers."
LICENSE = "GFDL-1.3-or-later"

PV = "1.6.4.5"

RPM_NAME = "man-pages-zh_CN-1.6.4.5-1.1.noarch.rpm"
RPM_HASH = "5942e4c555a512a3ab76eae1a0c978389bbf99a993dbaa240f9d660312212ebb15bda88005f3c45c50e6ff603f09fb00e8fc43a536218d7012856a24f598f034"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-man-zh \
man-pages-zh-CN"

RDEPENDS:${PN} += ""

inherit rpm
