SUMMARY = "Double-blind ABX comparison testing script"
DESCRIPTION = "abxtest is a tool for conducting listening (or other subjective) tests to \
determine whether a listener can discern a difference between two subjects \
under test, denoted A and B."
LICENSE = "GPL-2.0-or-later"

PV = "0.15.2b"

RPM_NAME = "abxtest-0.15.2b-3.11.aarch64.rpm"
RPM_HASH = "2f812e54e183a2f10e88357ba5433b3bab533101531799fdd2ddb7c494befb573c6ae36f045ce7fa2045d467c939dd1dabd8a8996a875234afb4f19b1c3c7976"

RPROVIDES:${PN} += "abxtest"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
