SUMMARY = "A cure for Cron's chronic email problem"
DESCRIPTION = "Cronic is a small shim shell script for wrapping cron jobs so that cron only \
sends email when an error has occurred. Cronic defines an error as any non- \
trace error output or a non-zero result code. Cronic filters Bash execution \
traces (or anything matching PS4) from the error output, so jobs can be run \
with execution tracing to aid forensic debugging. Cronic has no options, it \
simply executes its arguments."
LICENSE = "SUSE-Public-Domain"

PV = "3"

RPM_NAME = "cronic-3-1.24.noarch.rpm"
RPM_HASH = "2e37a5fbfa6fa44dc484064eb1c92860e1fb585d04e24321e4347de8652593ab58c1c6d0c45094017715a1ce9d048e80e03994402a9b387bfdc6043454b7369c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cronic"

RDEPENDS:${PN} += ""

inherit rpm
