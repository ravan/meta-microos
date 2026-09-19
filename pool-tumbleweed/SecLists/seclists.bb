SUMMARY = "SecLists is the security tester's companion"
DESCRIPTION = "SecLists is the security tester's companion. It's a collection of multiple \
types of lists used during security assessments, collected in one place. List \
types include usernames, passwords, URLs, sensitive data patterns, fuzzing \
payloads, web shells, and many more. The goal is to enable a security tester to \
pull this repository onto a new testing box and have access to every type of \
list that may be needed. \
 \
This project is maintained by Daniel Miessler, Jason Haddix, and g0tmi1k."
LICENSE = "MIT"

PV = "2026.1"

RPM_NAME = "SecLists-2026.1-1.2.noarch.rpm"
RPM_HASH = "0e27b0e1e192a16d6ca64aa06dfed778feea2f6a2fd0bfca55ef9049e69558512931e70963144cfc2879ddedd4929a23a9f5562021576eec3b3d8bdc0309bac2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "SecLists"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh"

inherit rpm
