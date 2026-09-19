SUMMARY = "The client of the GNU Health Hospital system"
DESCRIPTION = "The client of the GNU Health Hospital application"
LICENSE = "GPL-3.0-only"

PV = "5.0.2"

RPM_NAME = "gnuhealth-client-5.0.2-1.1.noarch.rpm"
RPM_HASH = "2a8dbe858c5affec6de5af26ba7cee97abffdd2025a6ee3826e1fbee1dd8e5b70f4c3edba27f0cd65f76c72c8aed996747c3d7b9a83744468a0d8a6f7e93b6f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnuhealth-client \
python3.13dist-gnuhealth-client \
python3dist-gnuhealth-client"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
gnu-free-fonts \
gobject-introspection \
opencv \
python-abi \
python3-GooCalendar \
python3-cairo \
python3-chardet \
python3-dateutil \
python3-gobject \
python3-gobject-Gdk \
python3-gobject-cairo \
python3-numpy \
python3-opencv \
python3-python-gnupg \
python3-pytz \
python3-setuptools \
python3-simplejson \
python3-xml"

inherit rpm
