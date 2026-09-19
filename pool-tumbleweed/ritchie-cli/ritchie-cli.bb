SUMMARY = "Ritchie - One CLI to rule them all"
DESCRIPTION = "Ritchie is an open source framework that creates and tweaks a CLI for your team. It allows you to easily create, build and share formulas. This package contains the CLI core, which can execute formulas stored inside other repositories such as ritchie-formulas."
LICENSE = "Apache-2.0"

PV = "2.11.3"

RPM_NAME = "ritchie-cli-2.11.3-2.27.aarch64.rpm"
RPM_HASH = "be10b099f42e257d1255709cedbbdc9e502c31a4331811ffa88439b8efd24ebe898dbc37d4728108dd352570898363038b36dfc06851b951db158b0ba20592c9"

RPROVIDES:${PN} += "ritchie-cli"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
