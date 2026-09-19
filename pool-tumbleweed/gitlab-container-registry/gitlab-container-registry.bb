SUMMARY = "The GitLab Container Registry"
DESCRIPTION = "The GitLab Container Registry originated as a fork of the Docker Distribution \
Registry, now CNCF Distribution, both distributed under Apache License Version \
2.0. \
 \
The first GitLab change on top of the upstream implementation was efe421fd, and \
since then we have diverged enough to the point where we decided to detach from \
upstream and proceed on our own path. \
 \
Since then, we have implemented and released several major performance \
improvements and bug fixes. For a list of changes, please see differences from \
upstream \
(https://gitlab.com/gitlab-org/container-registry/-/blob/master/docs/upstream-differences.md). \
These changes culminated on a new architecture based on a relational \
metadata database and the original goal, enabling online garbage collection \
(https://gitlab.com/gitlab-org/container-registry/-/blob/master/docs/spec/gitlab/online-garbage-collection.md)."
LICENSE = "Apache-2.0"

PV = "4.41.0"

RPM_NAME = "gitlab-container-registry-4.41.0-1.1.aarch64.rpm"
RPM_HASH = "22eec459191022110bdcab93f1359c28d46349f0559e08c799cfc567a27e0318d12d81da67410e9f7d1933ff81ea56b75dee2d3b08c1ff8c387fc89e6969379f"

RPROVIDES:${PN} += "config-gitlab-container-registry \
gitlab-container-registry \
group-gitlab-container-registry \
user-gitlab-container-registry"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6"

inherit rpm
