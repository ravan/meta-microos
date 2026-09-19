SUMMARY = "PipeWire media server upmixing configuration"
DESCRIPTION = "This package contains the configuration files to support upmixing."
LICENSE = "MIT"

PV = "1.6.8"

RPM_NAME = "pipewire-config-upmix-1.6.8-2.1.aarch64.rpm"
RPM_HASH = "fe5caf4729376ebd8c23a343edf60fcaa2b17517680e6bea6fe1185ef09973c7de81af0df546a1c8f75173c6bde086cf75f3bd88bb3d1308f7d3226f5f3e36ad"

RPROVIDES:${PN} += "pipewire-config-upmix"

RDEPENDS:${PN} += "libpipewire-0-3-0 \
pipewire"

inherit rpm
