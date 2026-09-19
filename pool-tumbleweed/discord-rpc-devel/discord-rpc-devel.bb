SUMMARY = "Development files for libdiscord-rpc"
DESCRIPTION = "Header files for the discord-rpc library."
LICENSE = "MIT"

PV = "3.4.0"

RPM_NAME = "discord-rpc-devel-3.4.0-3.14.aarch64.rpm"
RPM_HASH = "1030db26e5810f597f419693a14d3c2c2c09bb6d08eda8f78b1c4a97b7403a6ae38fe388e07c990ca207a0e24f5c585b967b5bbff140e7bf9de184cbab03a957"

RPROVIDES:${PN} += "discord-rpc-devel"

RDEPENDS:${PN} += "libdiscord-rpc3-4-0"

inherit rpm
