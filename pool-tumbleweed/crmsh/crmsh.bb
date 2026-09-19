SUMMARY = "High Availability cluster command-line interface"
DESCRIPTION = "The crm shell is a command-line interface for High-Availability \
cluster management on GNU/Linux systems. It simplifies the \
configuration, management and troubleshooting of Pacemaker-based \
clusters, by providing a powerful and intuitive set of features."
LICENSE = "GPL-2.0-or-later"

PV = "5.1.0+20260828.be794583"

RPM_NAME = "crmsh-5.1.0+20260828.be794583-1.1.noarch.rpm"
RPM_HASH = "26da98362a33704e71a69bf896f9f6b91d68fe3673b2467f0cb62858908954619fd751d7b9bfae89ef4289b1f2ac97865b7b15130d6ad6e0cc361db2d8f7835b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-crmsh \
crmsh"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
/usr/bin/which \
crmsh-scripts \
group-haclient \
pacemaker \
python-abi \
python3 \
python3-PyYAML \
python3-curses \
python3-lxml \
python3-packaging \
python3-python-dateutil \
user-hacluster"

inherit rpm
