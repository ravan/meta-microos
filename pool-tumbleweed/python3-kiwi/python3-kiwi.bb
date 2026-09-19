SUMMARY = "KIWI - Appliance Builder Next Generation"
DESCRIPTION = "Python 3 library of the KIWI Image System. Provides an operating system \
image builder for Linux supported hardware platforms as well as for \
virtualization and cloud systems like Xen, KVM, VMware, EC2 and more."
LICENSE = "GPL-3.0-or-later"

PV = "10.3.11"

RPM_NAME = "python3-kiwi-10.3.11-1.1.aarch64.rpm"
RPM_HASH = "81955447cb92cb37fdd8922acc7f163a3ef570b79f8208aa6503e240188bb2cb45426c797aadbde55ba40d1bf58b82ccef8d8cb603067b65d91bab585b5986ed"

RPROVIDES:${PN} += "python3-kiwi \
python3.13dist-kiwi \
python313-kiwi \
python3dist-kiwi"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
bash \
file \
kiwi-systemdeps-core \
python-abi \
python3 \
python3-PyYAML \
python3-docopt \
python3-lxml \
python3-requests \
python3-simplejson \
python3-xmltodict \
screen \
sed"

inherit rpm
