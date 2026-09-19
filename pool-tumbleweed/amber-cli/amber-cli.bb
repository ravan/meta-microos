SUMMARY = "CLI tool for tenants to use and access Amber services"
DESCRIPTION = "CLI tool for tenants to use and access Amber services. \
Amber remotely verifies trustworthiness of Intel SGX and Intel TDX TEEs. \
 \
All files are stored in user's home directory. Following are the details: \
* Configuration: $HOME/.config/tenantctl/config.yaml \
* Logs: $HOME/.config/tenantctl/logs/tac.log \
* Bin: $HOME/.local/bin/tenantctl"
LICENSE = "BSD-3-Clause"

PV = "1.13.1+git20250329.c2e3bb8"

RPM_NAME = "amber-cli-1.13.1+git20250329.c2e3bb8-1.8.aarch64.rpm"
RPM_HASH = "f59a8ed051f16cec78950e354c5a2c7d8cb0215ab3a5d9edee1010231033f77c9b46f64fc722adfc5bcbe6daeaa2c5f161ef482c7c0e51feffb1b2acbc312fb9"

RPROVIDES:${PN} += "amber-cli"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
