SUMMARY = "Gitops for non-Kubernetes folks"
DESCRIPTION = "Gitopper is GitOps for non-Kubernetes folks it watches a remote git repo, pulls \
changes and HUP the server (service) process. \
 \
A sparse (but with full history) git checkout will be done, so each service \
will only see the files it will actually need. Several bind mounts are then \
setup to give the service access to the file(s) in Git. If the target \
directories don't exist, they will be created, with the current user - if \
specified. \
 \
This tool does little more than just pull the repo, but the little it brings to \
the table allows for a GitOps workflow without resorting to Kubernetes like \
environments. \
 \
The Git repository that you are using to provision the services must have at \
least one (sub)directory for each service. \
 \
Gitopper will install packages if told to do so. It will not upgrade or \
downgrade them, assuming there is a better way of doing those. \
 \
The remote interface of gitopper uses SSH keys for authentication, this \
hopefully helps to fit in, in a sysadmin organisation. \
 \
The following features are implemented: \
 \
* Metrics: are included see below, they export a Git hash, so a rollout can be \
  tracked. \
* Diff detection: possible using the metrics or gitopperctl. \
* Out of band rollbacks: use gitopperctl to bypass the normal Git workflow. \
* No client side processing: files are used as they are in the Git repo. \
* Canarying: give a service a different branch to check out."
LICENSE = "Apache-2.0"

PV = "0.0.20"

RPM_NAME = "gitopper-0.0.20-1.13.aarch64.rpm"
RPM_HASH = "3c70bc0628063636ea0ea740101fa7a3ae08baf789903e95e5e80b6ed1017f0419398cd848aa62aec589183047a98e6c5b4b610d86b13f82ec651ab4dbb24d2e"

RPROVIDES:${PN} += "gitopper"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6"

inherit rpm
