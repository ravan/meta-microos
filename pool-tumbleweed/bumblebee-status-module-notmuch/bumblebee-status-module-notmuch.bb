SUMMARY = "Displays the result of a notmuch count query"
DESCRIPTION = "Displays the result of a notmuch count query."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-notmuch-2.1.5-4.7.noarch.rpm"
RPM_HASH = "76044d4338be31cdfc628095cb9542592797f1d0890daa2907f7bac15f18fdc073934155ec69d9e9377cd35e9877ede9259b420a1b80eda88007e63f99e701f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-notmuch"

RDEPENDS:${PN} += "bumblebee-status \
notmuch"

inherit rpm
