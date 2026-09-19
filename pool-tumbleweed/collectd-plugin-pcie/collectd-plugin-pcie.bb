SUMMARY = "PCIe Monitoring Plugin for collectd"
DESCRIPTION = "Optional collectd plugin to monitor PCIe errors."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.382.g2cd055fe"

RPM_NAME = "collectd-plugin-pcie-5.12.0.382.g2cd055fe-3.1.aarch64.rpm"
RPM_HASH = "3554e69ae6a892d823deae01a1a234ffafab510178262179da227cf08eb6487bd35ff1a2ec02b752f194b7b37be447a767662227dbc0ede64b4e6c957fb95038"

RPROVIDES:${PN} += "collectd-plugin-pcie"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
