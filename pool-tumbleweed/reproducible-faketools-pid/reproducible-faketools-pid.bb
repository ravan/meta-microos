SUMMARY = "use fixed pid"
DESCRIPTION = "a script to wrap su to start a build with a fixed process id \
to enhance the reproducibility of some packages"
LICENSE = "MIT"

PV = "0.5.5+0"

RPM_NAME = "reproducible-faketools-pid-0.5.5+0-1.7.noarch.rpm"
RPM_HASH = "d4467acf04166fe8fe551cbde3ac37bd1746c0edf593eddcd7899218cad7f5977adf066f6ea448aff44274245a10e16d2e1f5766845526f140015d2d7532924f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "reproducible-faketools-pid"

RDEPENDS:${PN} += "/usr/bin/sh \
reproducible-faketools"

inherit rpm
