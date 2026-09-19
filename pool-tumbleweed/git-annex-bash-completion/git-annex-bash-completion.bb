SUMMARY = "Bash completion for git-annex"
DESCRIPTION = "Optional dependency offering bash completion for git-annex"
LICENSE = "AGPL-3.0-or-later & GPL-3.0-or-later & BSD-2-Clause & MIT & GPL-2.0-only"

PV = "10.20260624"

RPM_NAME = "git-annex-bash-completion-10.20260624-1.3.aarch64.rpm"
RPM_HASH = "3c61c303fd7bd8622bed1b0acdaa498385f3fd91cc7ba58536866d0341dae118966475f9d69d441ac4ec3e74a0391777ae48ca64bb548d346d2c190ed2ba43d2"

RPROVIDES:${PN} += "git-annex-bash-completion"

RDEPENDS:${PN} += "bash-completion \
git-annex"

inherit rpm
