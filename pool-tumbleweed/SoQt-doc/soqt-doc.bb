SUMMARY = "API documentation for SoQt"
DESCRIPTION = "By using the combination of Coin, Qt and SoQt for your 3D applications, you \
have a framework for writing completely portable software across the whole range \
of UNIX, Linux, Microsoft Windows and Mac OS X operating systems. Coin, Qt and \
SoQt makes this possible from a 100% common codebase, which means there is a \
minimum of hassle for developers when working on multiplatform software, with \
the resulting large gains in productivity."
LICENSE = "BSD-3-Clause"

PV = "1.6.3"

RPM_NAME = "SoQt-doc-1.6.3-1.8.noarch.rpm"
RPM_HASH = "8554e6c00c954734afbed8bf00144185e334e586e83e3e02cfa5f579ec96894ec696775a6a899cd3086ab10b816ca7e68cedc1a2893bb839cca2c2a506ef2801"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "SoQt-doc"

RDEPENDS:${PN} += ""

inherit rpm
