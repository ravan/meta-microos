SUMMARY = "A simple, safe single expression evaluator library"
DESCRIPTION = "A quick single file library for easily adding evaluatable expressions \
into python projects. Say you want to allow a user to set an alarm volume, \
which could depend on the time of day, alarm level, how many previous alarms \
had gone off, and if there is music playing at the time. \
 \
Or if you want to allow simple formulare in a web application, but don’t want \
to give full eval() access, or don’t want to run in javascript on the client side."
LICENSE = "MIT"

PV = "1.0.7"

RPM_NAME = "python313-simpleeval-1.0.7-1.4.noarch.rpm"
RPM_HASH = "de1cceba8e4684ed30e0422b1dc2894e6e6728fbfd1d2ac90747b79f3bb42a0c36ea1921e6cb20124f5fa12f587e9f4b1197d5d427acaeeccc9d9af86dc84035"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-simpleeval \
python3.13dist-simpleeval \
python313-simpleeval \
python3dist-simpleeval"

RDEPENDS:${PN} += "python-abi"

inherit rpm
