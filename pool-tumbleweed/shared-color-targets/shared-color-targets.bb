SUMMARY = "Color targets for creating color profiles"
DESCRIPTION = "The shared-color-targets package contains various targets which are \
useful for programs that create ICC profiles."
LICENSE = "GPL-2.0-or-later & SUSE-Public-Domain & CC-BY-SA-3.0"

PV = "0.1.7"

RPM_NAME = "shared-color-targets-0.1.7-1.18.noarch.rpm"
RPM_HASH = "e5c6bf8f416b1517fcd2e9b55bd6691d6de5e6673737910c71061baf106dd268369e9dd909e9c5999e2eab8df336b5788f52f7cfe8eaf346ed2c5fee656fa447"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "shared-color-targets"

RDEPENDS:${PN} += ""

inherit rpm
