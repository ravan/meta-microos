SUMMARY = "A utility to simultaneously subscribe to MQTT servers/topics"
DESCRIPTION = "msoak is a utility to simultaneously subscribe to an arbitrary \
number of topics on any number of MQTT brokers and optionally \
modify or normalize received payloads before printing them out. \
This utility was created for being able to back up to a central \
location messages received by a number of brokers; instead of \
launching (and having to monitor success of) a large number of \
mosquitto_sub(1) programs, msoak took on the job. \
 \
msoak uses asynchronous connects to the MQTT brokers so that it \
can handle situations in which a broker may temporarily be \
unavailable."
LICENSE = "GPL-2.0-or-later"

PV = "0.8"

RPM_NAME = "msoak-0.8-2.11.aarch64.rpm"
RPM_HASH = "f312ec6a047ece1edaf89a7726f840c29fcfde4f0ff6e6471be60d9cc14a71dad3a4dcec9b2aee8210f382617116861cdb293972a234f80cd187745d4a42843f"

RPROVIDES:${PN} += "msoak"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libconfig.so.15 \
liblua5.3.so.5 \
libmosquitto.so.1"

inherit rpm
