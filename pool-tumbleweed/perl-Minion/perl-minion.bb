SUMMARY = "Job queue"
DESCRIPTION = "Minion is a high performance job queue for the Perl programming language, \
with support for multiple named queues, priorities, high priority fast \
lane, delayed jobs, cron style recurring jobs, job dependencies, job \
progress, job results, retries with backoff, rate limiting, unique jobs, \
expiring jobs, statistics, distributed workers, parallel processing, \
autoscaling, remote control, at https://mojolicious.org admin ui, resource \
leak protection and multiple backends (such as at \
https://www.postgresql.org). \
 \
Job queues allow you to process time and/or computationally intensive tasks \
in background processes, outside of the request/response lifecycle of web \
applications. Among those tasks you'll commonly find image resizing, spam \
filtering, HTTP downloads, building tarballs, warming caches and basically \
everything else you can imagine that's not super fast. \
 \
Take a look at our excellent documentation in Minion::Guide!"
LICENSE = "Artistic-2.0"

PV = "12.0.0"

RPM_NAME = "perl-Minion-12.0.0-3.1.noarch.rpm"
RPM_HASH = "cc7bb7f1979a967e82ea2ecd242a1e16d007b9a7bc468a1fff29118d2b42e76fbb35211a68371a297a2ecab5c3a410e274497ef9371170a2dfc1017e7eaeb154"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-LinkCheck \
perl-LinkCheck--Controller--Links \
perl-LinkCheck--Task--CheckLinks \
perl-Minion \
perl-Minion--Backend \
perl-Minion--Backend--Pg \
perl-Minion--Command--minion \
perl-Minion--Command--minion--job \
perl-Minion--Command--minion--schedule \
perl-Minion--Command--minion--worker \
perl-Minion--Iterator \
perl-Minion--Job \
perl-Minion--Util \
perl-Minion--Worker \
perl-Mojolicious--Plugin--Minion \
perl-Mojolicious--Plugin--Minion--Admin"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Mojolicious \
perl-YAML--XS"

inherit rpm
