SUMMARY = "Cray specific plugins"
DESCRIPTION = "Plugins for specific cray hardware, includes power and knl node management. \
Contains also cray specific documentation."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "25.11.2"

RPM_NAME = "slurm-cray-25.11.2-1.6.aarch64.rpm"
RPM_HASH = "65dbefd1a3a528a6457d5b62f658330c0f747c54ae3409ce7730d584fd4a1983eb99c96b00f80a3e5fc59799119aacc0d9e7b8b8c4bc807f12eef82f513b9e67"

RPROVIDES:${PN} += "slurm-cray"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
