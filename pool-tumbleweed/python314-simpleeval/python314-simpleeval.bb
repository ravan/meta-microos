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

RPM_NAME = "python314-simpleeval-1.0.7-1.4.noarch.rpm"
RPM_HASH = "313be09cd1ed155f3389d6004870b7d2cf54297aecff3f655f577b4e53100bc2c836e6071e98f7ed257d4ca04ce45cf64dde8692abd72eb5afb3a85f3f08c91a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-simpleeval \
python314-simpleeval \
python3dist-simpleeval"

RDEPENDS:${PN} += "python-abi"

inherit rpm
