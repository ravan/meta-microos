SUMMARY = "Automatically load the ntsync kernel module"
DESCRIPTION = "Automatically load the ntsync kernel module. \
 \
The module allows wine to handle the translations of some Windows specific \
primitives in a more efficient way."
LICENSE = "MIT"

PV = "0.0.2"

RPM_NAME = "ntsync-autoload-0.0.2-1.4.noarch.rpm"
RPM_HASH = "7c147157a2926b08d3a40df2bce96ba4ef3307e20d19f813c2331b4781fec9c49cedb857943e3afee1d3e699442431598bb52fd9e7158902ea8665cb1feb2f4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ntsync-autoload"

RDEPENDS:${PN} += ""

inherit rpm
