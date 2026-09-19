SUMMARY = "Modular IPC-based desktop launcher service"
DESCRIPTION = "Modular IPC-based desktop launcher service, written in Rust. Desktop launchers \
may interface with this service via spawning the pop-launcher process and \
communicating to it via JSON IPC over the stdin and stdout pipes. The launcher \
service will also spawn plugins found in plugin directories on demand, based on \
the queries sent to the service. \
 \
Using IPC enables each plugin to isolate their data from other plugin processes \
and frontends that are interacting with them. If a plugin crashes, the launcher \
will continue functioning normally, gracefully cleaning up after the crashed \
process. Frontends and plugins may also be written in any language. The \
pop-launcher will do its part to schedule the execution of these plugins in \
parallel, on demand."
LICENSE = "MPL-2.0"

PV = "1.0.8"

RPM_NAME = "pop-launcher-1.0.8-1.5.aarch64.rpm"
RPM_HASH = "1c56af529a22958465159237d607f430addee2a12fc0360af6ac7bb65af8fe85885f7db603dbd67bd18c2d6d6a80e8020a200d51a6f4eb4b6cc023785822a834"

RPROVIDES:${PN} += "pop-launcher"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
