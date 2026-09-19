SUMMARY = "Local LLM Server features for openQA workers"
DESCRIPTION = "openQA workers can optionally host a local llama.cpp server to provide \
LLM features directly from the worker node. This package provides the \
Podman Quadlet configuration to automatically manage the server."
LICENSE = "GPL-2.0-or-later"

PV = "5.1788605562.29b45941"

RPM_NAME = "openQA-llm-server-5.1788605562.29b45941-1.1.aarch64.rpm"
RPM_HASH = "a73086de72f814746117ba8a2508274d4a92ad4fb45e321d866101b1878f0032b0635fac1cb4f364bb6e0a6c8503b3a9933153d35686f98ddd3364503dfd12d6"

RPROVIDES:${PN} += "openQA-llm-server"

RDEPENDS:${PN} += "/usr/bin/sh \
openQA-worker \
podman"

inherit rpm
