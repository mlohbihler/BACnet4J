BACnet4J
========
NOTE: The official version of BACnet4J is at https://github.com/infiniteautomation/BACnet4J. 

BACnet4J is a pure Java implementation of the BACnet specification. Originally developed for supervisory use, it now includes support for many objects and so may be suitable for embedded use as well. Protocols supported include IPv4, IPv6, and MS/TP.

A discussion forum for this package can be found at http://infiniteautomation.com/forum/category/12/bacnet4j-general-discussion.

Releases
========
*Version 3.2 release notes*
- Added BBMD support
- Much enhanced support for acting as a foreign device

*Version 3.0 release notes*

- The ANT build system has been replaced with Gradle
- Dependencies have been removed. BACnet4J now operates without any external libs
- Support for IPv6 added
- Ad hoc test code has begun to be replaced with JUnit tests 
- Blocking request calls have been replaced with non-blocking promises/callbacks
- Added implementations of many objects, including analog value, binary output, binary value, calendar, multistate value, notification classes, and schedules.
- Added intrinsic alarming for implemented objects
- Added COV reporting
- Many bug fixes and minor enhancements

*Version 2.0 release notes*

The networking package of this product has been pretty much entirely rewritten to support MS/TP. These changes implied many changes to the LocalDevice public interface, so if you were using version 1.x you will need to port some code to upgrade.

License
=======
This software is licensed under GPL. Commercial licensers can pay an upgrade fee to use this new version (2.x and later) commercially.
