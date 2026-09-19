SUMMARY = "Documentation for solaar"
DESCRIPTION = "Solaar will detect all devices paired with your Unifying Receiver, and \
at the very least display some basic information about them. \
 \
For some devices, extra settings (usually not available through the \
standard Linux system configuration) are supported. For a full list of \
supported devices and their features, see docs/devices.md."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.20"

RPM_NAME = "solaar-doc-1.1.20-1.1.noarch.rpm"
RPM_HASH = "ecd8671b28a38b384c7f2ae100008f4e2aee3976ef328b27aa273e7806b7c8ff77cf18c67b2206f35f59f2cf120fa395132e943814ffed5f9a57ab6d7da53b36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "solaar-doc"

RDEPENDS:${PN} += ""

inherit rpm
