SUMMARY = "Python module to allow customization of the process title"
DESCRIPTION = "Changing the title is mostly useful in multi-process systems, for example when \
a master process is forked: changing the children's title allows to identify \
the task each process is busy with. The technique is used by PostgreSQL  and \
the OpenSSH Server for example."
LICENSE = "BSD-3-Clause"

PV = "1.3.7"

RPM_NAME = "python314-setproctitle-1.3.7-2.1.aarch64.rpm"
RPM_HASH = "5b7cb074a48e1021b890c2f446738ba823d916ab7ee45e9cb40ece6b2ab0f2262718d9200083cebf760922d156c1a6c79f2243da00e922fe75f6d62cd64ea5c8"

RPROVIDES:${PN} += "python3.14dist-setproctitle \
python314-setproctitle \
python3dist-setproctitle"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
