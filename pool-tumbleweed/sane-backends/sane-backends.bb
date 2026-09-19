SUMMARY = "SANE (Scanner Access Now Easy) Scanner Drivers"
DESCRIPTION = "The software consists of SANE scanner drivers, \
'scanimage,' and the 'saned' daemon. \
 \
A SANE scanner driver is used via a SANE front-end. \
This package contains the command line front-end 'scanimage'. \
There are graphical front-ends in other packages like \
XSane (package xsane), Skanlite for KDE4 (package skanlite), \
and Kooka for KDE3 (package kdegraphics3-scan). \
 \
The 'saned' daemon provides the service 'sane-port' \
to access scanners that are connected to a server \
via network from client hosts that run the 'net' meta driver."
LICENSE = "GPL-2.0-or-later & SUSE-GPL-2.0+-with-sane-exception & SUSE-Public-Domain"

PV = "1.3.1"

RPM_NAME = "sane-backends-1.3.1-3.11.aarch64.rpm"
RPM_HASH = "8de1b2173ec5da7158145102aaf956ea40e19b55596c78cfb7986bd08911fec3c156d8edaddee17135a6bc81c188a5f1d98212902f481ea8582eb51731907b2f"

RPROVIDES:${PN} += "config-sane-backends \
sane \
sane-backends"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libc.so.6 \
libcairo.so.2 \
libcurl.so.4 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjpeg.so.8 \
libm.so.6 \
libnetsnmp.so.45 \
libpng16.so.16 \
libpoppler-glib.so.8 \
libsane.so.1 \
libsane1 \
libstdc++.so.6 \
libtiff.so.6 \
libusb-1.0.so.0 \
libv4l1.so.0 \
libxml2.so.16 \
systemd"

inherit rpm
