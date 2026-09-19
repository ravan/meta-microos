SUMMARY = "Iosevka in monospace, Recursive Mono style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS17 typeface (monospace, Recursive Mono \
style)."
LICENSE = "OFL-1.1"

PV = "34.8.1"

RPM_NAME = "iosevka-ss17-fonts-34.8.1-1.1.noarch.rpm"
RPM_HASH = "1c8dd2edc245cb88715019f22cae6e5c7bef02489b1c73f0a30299adfc91d58a9fa9c2c376c776503b47bd7ea48084b3a8ec769ece98077b06d95c348a7ecf94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss17-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
