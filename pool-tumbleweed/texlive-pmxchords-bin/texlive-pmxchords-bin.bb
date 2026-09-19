SUMMARY = "Binary files of pmxchords"
DESCRIPTION = "Binary files of pmxchords"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn32405"

RPM_NAME = "texlive-pmxchords-bin-2026.20260301.svn32405-120.4.aarch64.rpm"
RPM_HASH = "0021c4c8c4f58fb7746a276a3da223d35bf4a6112d0e608d20b245c3cacdd2f2e17875ea3eb5a315f4f34aaf2c777df198580a39831069519104feee065a8ea6"

RPROVIDES:${PN} += "texlive-pmxchords-bin"

RDEPENDS:${PN} += "texlive-pmxchords"

inherit rpm
