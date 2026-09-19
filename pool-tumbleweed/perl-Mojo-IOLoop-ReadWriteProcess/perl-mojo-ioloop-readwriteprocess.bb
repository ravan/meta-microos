SUMMARY = "Execute external programs or internal code blocks as separate process"
DESCRIPTION = "Mojo::IOLoop::ReadWriteProcess is yet another process manager."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.1.0"

RPM_NAME = "perl-Mojo-IOLoop-ReadWriteProcess-1.1.0-1.8.noarch.rpm"
RPM_HASH = "378e8783fd1f294ee319cee6043c6c34e725d524cef980896c619c6c6acbf8f6a64798d8b0282a0872ee8d824138dc8d92656da228d31f68e830ac985757b656"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mojo--IOLoop--ReadWriteProcess \
perl-Mojo--IOLoop--ReadWriteProcess--CGroup \
perl-Mojo--IOLoop--ReadWriteProcess--CGroup--v1 \
perl-Mojo--IOLoop--ReadWriteProcess--CGroup--v1--Cpuacct \
perl-Mojo--IOLoop--ReadWriteProcess--CGroup--v1--Cpuset \
perl-Mojo--IOLoop--ReadWriteProcess--CGroup--v1--Devices \
perl-Mojo--IOLoop--ReadWriteProcess--CGroup--v1--Freezer \
perl-Mojo--IOLoop--ReadWriteProcess--CGroup--v1--Memory \
perl-Mojo--IOLoop--ReadWriteProcess--CGroup--v1--Netcls \
perl-Mojo--IOLoop--ReadWriteProcess--CGroup--v1--Netprio \
perl-Mojo--IOLoop--ReadWriteProcess--CGroup--v1--PID \
perl-Mojo--IOLoop--ReadWriteProcess--CGroup--v1--RDMA \
perl-Mojo--IOLoop--ReadWriteProcess--CGroup--v2 \
perl-Mojo--IOLoop--ReadWriteProcess--CGroup--v2--CPU \
perl-Mojo--IOLoop--ReadWriteProcess--CGroup--v2--IO \
perl-Mojo--IOLoop--ReadWriteProcess--CGroup--v2--Memory \
perl-Mojo--IOLoop--ReadWriteProcess--CGroup--v2--PID \
perl-Mojo--IOLoop--ReadWriteProcess--CGroup--v2--RDMA \
perl-Mojo--IOLoop--ReadWriteProcess--Container \
perl-Mojo--IOLoop--ReadWriteProcess--Exception \
perl-Mojo--IOLoop--ReadWriteProcess--Namespace \
perl-Mojo--IOLoop--ReadWriteProcess--Pool \
perl-Mojo--IOLoop--ReadWriteProcess--Queue \
perl-Mojo--IOLoop--ReadWriteProcess--Session \
perl-Mojo--IOLoop--ReadWriteProcess--Shared--Lock \
perl-Mojo--IOLoop--ReadWriteProcess--Shared--Memory \
perl-Mojo--IOLoop--ReadWriteProcess--Shared--Semaphore \
perl-Mojo-IOLoop-ReadWriteProcess"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-IPC--SharedMem \
perl-Mojolicious"

inherit rpm
