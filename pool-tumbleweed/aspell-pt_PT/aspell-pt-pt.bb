SUMMARY = "Portuguese (Português) Dictionary for Aspell"
DESCRIPTION = "A Portuguese (Português) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "20190329"

RPM_NAME = "aspell-pt_PT-20190329-4.7.aarch64.rpm"
RPM_HASH = "d419aa755d3926e89f17b8d54a898aaa15372323c30808ba527b7442b14de5d2e965674a73e8cf97ee6c9d458a6b6d9155de755eb382ac6d8ce45f7996aa00bf"

RPROVIDES:${PN} += "aspell-pt-PT \
locale-aspell-pt"

RDEPENDS:${PN} += ""

inherit rpm
