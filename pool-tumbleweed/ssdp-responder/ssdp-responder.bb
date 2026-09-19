SUMMARY = "SSDP responder for Linux"
DESCRIPTION = "ssdpd is a stand-alone daemon that implements the Simple Service \
Discovery Protocol (SSDP) for use by networked Linux devices that \
want to announce themselves to systems running Windows. ssdpd has a \
built-in web server for serving the UPnP XML description which \
Windows uses to present the icon when an InternetGatewayDevice is \
announced."
LICENSE = "ISC"

PV = "2.0"

RPM_NAME = "ssdp-responder-2.0-1.13.aarch64.rpm"
RPM_HASH = "6b10a18d114a1be59e755af5d3870970bffd3eb41243a8dab2e9a85709e3ab53d138c4e8c5f4f428ffb6b2ebf27baa7e5315c7232f7bba4606cdfecab2cdff4c"

RPROVIDES:${PN} += "ssdp-responder"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
systemd"

inherit rpm
