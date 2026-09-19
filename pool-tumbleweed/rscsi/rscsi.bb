SUMMARY = "Remote SCSI server"
DESCRIPTION = "The rscsi command is a remote generic SCSI transport server program. \
rscsi is a program that is run locally on the machine with SCSI \
devices, it is used by remote programs like cdrecord(1), cdda2wav(1), \
readcd(1), and sformat(1) that like to access SCSI devices through an \
interprocess communication connection via libscg.  rscsi is normally \
started up with an rexec(3) or rcmd(3) call but it may also be \
connected via an internal pipe to an ssh(1) session that was set up \
by the remote user."
LICENSE = "CDDL-1.0"

PV = "2024.03.21"

RPM_NAME = "rscsi-2024.03.21-53.5.aarch64.rpm"
RPM_HASH = "cd56fb3fdab0df79c74075cdd11c401372765918ecce6d96ae690d0db65eb38d80b5698d87ef62b5709dc82a6313224026cd665fe16dac5075c3650a5a6ed704"

RPROVIDES:${PN} += "cdrecord-/usr/sbin/rscsi \
config-rscsi \
rscsi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdeflt.so.1.0 \
libscg.so.1.0 \
libschily.so.2.0"

inherit rpm
