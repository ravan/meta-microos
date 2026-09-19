SUMMARY = "A locking wrapper script"
DESCRIPTION = "withlock is a locking wrapper script to make sure that some program isn't run \
more than once. It is ideal to prevent periodic jobs spawned by cron from \
stacking up. \
 \
The locks created are valid only while the wrapper is running, and thus will \
never require a cleanup, as after a reboot. Thus, the wrapper is safe and easy \
to use, and much better than implementing half-hearted locking within scripts."
LICENSE = "Apache-2.0"

PV = "0.5"

RPM_NAME = "withlock-0.5-3.10.noarch.rpm"
RPM_HASH = "18e619b03d2aef894586c137f0e6a179c1b29d5d4acb3f58c3ffe1b122da5e30fead0b71f8aa0b16094087b69581e9a6908e275d99f33a8998eb0b2db9aae083"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "withlock"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3"

inherit rpm
