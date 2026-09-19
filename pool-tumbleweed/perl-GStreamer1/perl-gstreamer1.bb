SUMMARY = "Bindings for GStreamer 1.0, the open source multimedia framework"
DESCRIPTION = "GStreamer1 implements a framework that allows for processing and encoding \
of multimedia sources in a manner similar to a shell pipeline. \
 \
Because it's introspection-based, most of the classes follow directly from \
the C API. Therefore, most of the documentation is by example rather than a \
full breakdown of the class structure."
LICENSE = "BSD-2-Clause"

PV = "0.3.0"

RPM_NAME = "perl-GStreamer1-0.3.0-1.7.noarch.rpm"
RPM_HASH = "ff7289d2fd0e9a25c2fb511263653ac0a00f8ec6c3779186673898863f7a8e8ce8260a471e5d31a366a747851185f580335dfd18bde1cccc6299104450a0ac13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-GStreamer1 \
perl-GStreamer1--Caps--Simple"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Glib--Object--Introspection \
typelib-1-0-Gst-1-0 \
typelib-1-0-GstApp-1-0"

inherit rpm
