SUMMARY = "Stroke 5 input method"
DESCRIPTION = "Stroke 5 input method."
LICENSE = "GPL-3.0-or-later"

PV = "1.8.14"

RPM_NAME = "ibus-table-chinese-stroke5-1.8.14-1.6.noarch.rpm"
RPM_HASH = "20ca1d499554e32a75558c1e1f54b7bde162d04514d52c6af8ea78e05778fc84217e001771c0579c707439d2b2a690417f814c564ea6f1ad50fed06fc521c316"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-chinese-stroke5 \
ibus-table-stroke5 \
locale-ibus-zh-CN"

RDEPENDS:${PN} += "/usr/bin/sh \
ibus-table"

inherit rpm
