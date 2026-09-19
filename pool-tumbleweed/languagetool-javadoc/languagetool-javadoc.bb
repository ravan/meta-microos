SUMMARY = "Javadoc for languagetool"
DESCRIPTION = "This package contains javadoc for languagetool."
LICENSE = "LGPL-2.1-or-later"

PV = "4.8"

RPM_NAME = "languagetool-javadoc-4.8-13.1.noarch.rpm"
RPM_HASH = "b0cdc8996863c9d8393a8e194ceb56bccfaea7c98ed6a5477f292a58f77f37e3c6a25743036b1fcf524ae72ab5a70a6ba03f75aba70d554e9b2ecd9a44b050db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "languagetool-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
