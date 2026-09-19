SUMMARY = "Latex input method for IBus framework"
DESCRIPTION = "ibus-table-latex provides Latex input method on IBus Table under IBus framework."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.21"

RPM_NAME = "ibus-table-latex-1.3.21-1.5.noarch.rpm"
RPM_HASH = "2e5f49e2802baf82f604ab5073230dbd518d4032b8218157d3f4e49efb629f41779dc5408be1343d22dfb6476f0931d9f5d8d721cced151f99d5a6f9c5846b38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-latex"

RDEPENDS:${PN} += "ibus-table"

inherit rpm
