SUMMARY = "Tool to generate Ignition configs from Butane Configs"
DESCRIPTION = "Butane translates human-readable Butane Configs into machine-readable \
Ignition configs for provisioning operating systems that use Ignition."
LICENSE = "Apache-2.0"

PV = "0.27.0"

RPM_NAME = "butane-0.27.0-1.5.aarch64.rpm"
RPM_HASH = "a3b2a750cc621f209b6ae80f2d9c03e68a60594e1faa653001279f097711d4c88842bab009a7ced5bac8a5b9c39cb7d0dfd79e8e72555842ac1c0899b136f754"

RPROVIDES:${PN} += "butane \
ignition-config-transpiler"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
