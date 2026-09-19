SUMMARY = "Linux Trace Toolkit Userspace Tracer library"
DESCRIPTION = "This library provides support for developing programs using LTTng \
userspace tracing."
LICENSE = "GPL-2.0-only"

PV = "2.14.0"

RPM_NAME = "lttng-ust-devel-2.14.0-1.3.aarch64.rpm"
RPM_HASH = "c0409579f4cd50522e7ce6a12c9c06119ec55e0a33558d4fdc628eec574ce1a1999f07e30ed60c9aba1046c5e11974aca23963cd65ac05b4564f5b7dfa9a735b"

RPROVIDES:${PN} += "lttng-ust \
lttng-ust-devel \
pkgconfig-lttng-ust \
pkgconfig-lttng-ust-ctl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/python3.13 \
liblttng-ust-ctl6 \
liblttng-ust-python-agent1 \
liblttng-ust1 \
pkgconfig-liburcu"

inherit rpm
