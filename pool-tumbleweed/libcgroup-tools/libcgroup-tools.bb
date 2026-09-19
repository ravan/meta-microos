SUMMARY = "Control groups management tools"
DESCRIPTION = "NOTE - this release is not guaranteed to be backward compatible with previous releases! \
 \
Libcgroup v3.1.0 adds systemd support to the libcgroup library.  Users can now create \
systemd scopes via the libcgroup C APIs, command line tools, and (experimental) Python \
bindings.  These scopes can be 'delegated' (or not), which is systemd parlance for a \
cgroup hierarchy that is being managed by another entity.  Systemd will not modify \
settings or processes within a delegated hierarchy. \
 \
Note that libcgroup v3.1.0 is still capable of modifying cgroups and processes anywhere \
in the cgroup hierarchy, including the root cgroup and its children (which are owned \
by systemd).  Modifying cgroups and processes owned by systemd is a violation of the \
cgroup single-writer rule, and systemd reserves the right to undo any changes made by \
other processes.  The libcgroup team strongly discourages modifying systemd-managed \
cgroups - especially on production systems - but it can be useful during prototyping \
and on experimental systems. \
 \
The initial release of the cgroups implementation was in Linux 2.6.24.  Over time, \
various cgroup controllers have been added to  allow  the  management  of  various \
types of resources.  However, the development of these controllers was largely \
uncoordinated, with the result that many inconsistencies arose between controllers and \
management of the cgroup hierarchies became rather complex."
LICENSE = "LGPL-2.1-only"

PV = "3.1.0"

RPM_NAME = "libcgroup-tools-3.1.0-1.9.aarch64.rpm"
RPM_HASH = "3a75759151bcde5e2456f19dbd6e73cf73866e6c4657600605671ea3b3c736a0f6c45403cd9697aeeea9f9f2e1e1a74ca4f61a704c40d4670eae3f89af1e6635"

RPROVIDES:${PN} += "config-libcgroup-tools \
group-cgred \
libcgroup-tools \
libcgroup1-/usr/bin/cgexec"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcgroup.so.3 \
permissions \
sysuser-shadow"

inherit rpm
