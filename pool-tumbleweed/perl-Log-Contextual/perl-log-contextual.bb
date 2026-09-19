SUMMARY = "Simple logging interface with a contextual log"
DESCRIPTION = "Major benefits: \
 \
* * Efficient \
 \
The default logging functions take blocks, so if a log level is disabled, \
the block will not run: \
 \
   \
  log_debug { 'the new count in the database is ' . $rs->count }; \
 \
Similarly, the 'D' prefixed methods only 'Dumper' the input if the level is \
enabled. \
 \
* * Handy \
 \
The logging functions return their arguments, so you can stick them in the \
middle of expressions: \
 \
  for (log_debug { 'downloading:\\n' . join qq(\\n), @_ } @urls) { ... } \
 \
* * Generic \
 \
'Log::Contextual' is an interface for all major loggers. If you log through \
'Log::Contextual' you will be able to swap underlying loggers later. \
 \
* * Powerful \
 \
'Log::Contextual' chooses which logger to use based on user defined \
'CodeRef's. Normally you don't need to know this, but you can take \
advantage of it when you need to later. \
 \
* * Scalable \
 \
If you just want to add logging to your basic application, start with \
Log::Contextual::SimpleLogger and then as your needs grow you can switch to \
Log::Dispatchouli or Log::Dispatch or Log::Log4perl or whatever else. \
 \
This module is a simple interface to extensible logging. It exists to \
abstract your logging interface so that logging is as painless as possible, \
while still allowing you to switch from one logger to another. \
 \
It is bundled with a really basic logger, Log::Contextual::SimpleLogger, \
but in general you should use a real logger instead. For something more \
serious but not overly complicated, try Log::Dispatchouli (see SYNOPSIS for \
example.)"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.009001"

RPM_NAME = "perl-Log-Contextual-0.009001-1.12.noarch.rpm"
RPM_HASH = "6ab782d2c8f4b2f33591f6c3768e128e201716bc736268f659899de70b2b815bd7746f1fd24053b37fd512878fd5a17b8d8b35a907d8bd27ee2b9cae473360e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Log--Contextual \
perl-Log--Contextual--Easy--Default \
perl-Log--Contextual--Easy--Package \
perl-Log--Contextual--Role--Router \
perl-Log--Contextual--Role--Router--HasLogger \
perl-Log--Contextual--Role--Router--SetLogger \
perl-Log--Contextual--Role--Router--WithLogger \
perl-Log--Contextual--Router \
perl-Log--Contextual--SimpleLogger \
perl-Log--Contextual--TeeLogger \
perl-Log--Contextual--WarnLogger \
perl-Log-Contextual"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Data--Dumper--Concise \
perl-Moo"

inherit rpm
