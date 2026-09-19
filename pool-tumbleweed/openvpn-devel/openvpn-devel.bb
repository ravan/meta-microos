SUMMARY = "OpenVPN plugin header"
DESCRIPTION = "This package provides the header file to build external plugins."
LICENSE = "GPL-2.0-only-with-openvpn-openssl-exception"

PV = "2.7.5"

RPM_NAME = "openvpn-devel-2.7.5-1.1.aarch64.rpm"
RPM_HASH = "8494f579313ab9a3a515075217ab1c7b9e71cb9dd30d103085f19df96a31be201be5e5bd0f4da09153b598fa9ad85823a46d03eeb2251dcc9f64a6813538b700"

RPROVIDES:${PN} += "openvpn-devel"

RDEPENDS:${PN} += "openvpn"

inherit rpm
