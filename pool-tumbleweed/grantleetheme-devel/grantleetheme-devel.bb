SUMMARY = "Development package for grantleetheme"
DESCRIPTION = "The development package for the grantleetheme library"
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "grantleetheme-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "2dd2bf429c48c758bf55259ad10c52fa14603d982763029d97d4308b89b67ecd2166a4656c3e7f36f57312284bbca59b21760219b58886c092bc4451fd589099"

RPROVIDES:${PN} += "cmake-KPim6GrantleeTheme \
grantleetheme-devel"

RDEPENDS:${PN} += "cmake-KF6TextTemplate \
libKPim6GrantleeTheme6"

inherit rpm
