SUMMARY = "Daemon for communication with Viessmann heating controllers"
DESCRIPTION = "vcontrold is a software daemon written in C for communication with \
the 'Optolink' interface of Viessmann heating controllers."
LICENSE = "GPL-3.0-or-later"

PV = "v0.98.10+git20210418.977e6f5"

RPM_NAME = "vcontrold-v0.98.10+git20210418.977e6f5-2.7.aarch64.rpm"
RPM_HASH = "cfc04acb46ea42028312d9afcb8ac7d6c82c987e78eea41e1eb10184d0f03a96de03b2dfb2a4c7ae4a518ac7efbe91fcbfc02d1e4732a382f46c6c24b6cbf9d9"

RPROVIDES:${PN} += "config-vcontrold \
group-vcontrold \
user-vcontrold \
vcontrold"

RDEPENDS:${PN} += "/usr/bin/sh \
group-dialout \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.16 \
sysuser-shadow"

inherit rpm
