SUMMARY = "Iosevka in monospace, Lucida style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS13 typeface (monospace, Lucida style)."
LICENSE = "OFL-1.1"

PV = "34.8.1"

RPM_NAME = "iosevka-ss13-fonts-34.8.1-1.1.noarch.rpm"
RPM_HASH = "198938d87c725785456ce29cdfb44fa99e0482046f3e5e2bcb755041b1f300c96b0688889389ed6d95f27325e028aa9ccea6608aefa8cf1833081f918c20aac2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss13-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
