SUMMARY = "Not Safe For Work Lua scripts used by libquvi"
DESCRIPTION = "Website fetching scripts used by libquvi-scripts that are marked as 'NSFW' \
(Not Safe For Work)."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.20131130"

RPM_NAME = "libquvi-scripts-nsfw-0.9.20131130-4.15.aarch64.rpm"
RPM_HASH = "aa55ef502e9a1a3e3f46dd47e5434a40ff29a4e4f71c38b15cc932a73a789e199418a5d7cdde666a37cda5ffe32ba5f5f758ce770c97b6193340d32c85ac6852"

RPROVIDES:${PN} += "libquvi-scripts-nsfw"

RDEPENDS:${PN} += "libquvi-scripts"

inherit rpm
