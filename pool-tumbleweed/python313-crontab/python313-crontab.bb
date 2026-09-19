SUMMARY = "Python module for parsing and using crontab schedules"
DESCRIPTION = "This package offers a method of parsing crontab schedule entries and \
determining when an item should next be run. More specifically, it \
calculates a delay in seconds from when the .next() method is called \
to when the item should next be executed."
LICENSE = "LGPL-2.1-only"

PV = "1.0.5"

RPM_NAME = "python313-crontab-1.0.5-1.5.noarch.rpm"
RPM_HASH = "d15ed468df6c5186c8b9c9464a300b865bf8e8c2d6906d4621c57bb370488d0991aed371d18bbf82d8719aa6d6fd44d7ff62bcc38aa255ea40023edd136843e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-crontab \
python3.13dist-crontab \
python313-crontab \
python3dist-crontab"

RDEPENDS:${PN} += "python-abi \
python313-python-dateutil \
python313-pytz"

inherit rpm
