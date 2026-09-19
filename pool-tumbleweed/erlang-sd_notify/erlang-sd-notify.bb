SUMMARY = "Erlang interface to systemd notify subsystem"
DESCRIPTION = "Erlang module for native access to the systemd-notify facilities."
LICENSE = "MIT"

PV = "1.1"

RPM_NAME = "erlang-sd_notify-1.1-2.13.aarch64.rpm"
RPM_HASH = "585c4849c0b4aee07c3d450a78f18d8d49c3b95abf3f299c029f8db44776f33c8aed6857f418e6b954496db573bc18535856223b3cf11865f23415ba119c3fe4"

RPROVIDES:${PN} += "erlang-sd-notify"

RDEPENDS:${PN} += "erlang"

inherit rpm
